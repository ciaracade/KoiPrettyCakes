package net.minecraft.network.chat;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Optional;
import javax.annotation.Nullable;

public class LastSeenMessagesValidator {
   private final int lastSeenCount;
   private final ObjectList<LastSeenTrackedEntry> trackedMessages = new ObjectArrayList<>();
   @Nullable
   private MessageSignature lastPendingMessage;

   public LastSeenMessagesValidator(int pLastSEendCount) {
      this.lastSeenCount = pLastSEendCount;

      for(int i = 0; i < pLastSEendCount; ++i) {
         this.trackedMessages.add((LastSeenTrackedEntry)null);
      }

   }

   public void addPending(MessageSignature pSignature) {
      if (!pSignature.equals(this.lastPendingMessage)) {
         this.trackedMessages.add(new LastSeenTrackedEntry(pSignature, true));
         this.lastPendingMessage = pSignature;
      }

   }

   public int trackedMessagesCount() {
      return this.trackedMessages.size();
   }

   public boolean applyOffset(int p_251273_) {
      int i = this.trackedMessages.size() - this.lastSeenCount;
      if (p_251273_ >= 0 && p_251273_ <= i) {
         this.trackedMessages.removeElements(0, p_251273_);
         return true;
      } else {
         return false;
      }
   }

   public Optional<LastSeenMessages> applyUpdate(LastSeenMessages.Update pLastSeenUpdater) {
      if (!this.applyOffset(pLastSeenUpdater.offset())) {
         return Optional.empty();
      } else {
         ObjectList<MessageSignature> objectlist = new ObjectArrayList<>(pLastSeenUpdater.acknowledged().cardinality());
         if (pLastSeenUpdater.acknowledged().length() > this.lastSeenCount) {
            return Optional.empty();
         } else {
            for(int i = 0; i < this.lastSeenCount; ++i) {
               boolean flag = pLastSeenUpdater.acknowledged().get(i);
               LastSeenTrackedEntry lastseentrackedentry = this.trackedMessages.get(i);
               if (flag) {
                  if (lastseentrackedentry == null) {
                     return Optional.empty();
                  }

                  this.trackedMessages.set(i, lastseentrackedentry.acknowledge());
                  objectlist.add(lastseentrackedentry.signature());
               } else {
                  if (lastseentrackedentry != null && !lastseentrackedentry.pending()) {
                     return Optional.empty();
                  }

                  this.trackedMessages.set(i, (LastSeenTrackedEntry)null);
               }
            }

            return Optional.of(new LastSeenMessages(objectlist));
         }
      }
   }
}
package net.minecraft.world.level.storage.loot.functions;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.InstrumentItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class SetInstrumentFunction extends LootItemConditionalFunction {
   final TagKey<Instrument> options;

   SetInstrumentFunction(LootItemCondition[] pPredicates, TagKey<Instrument> pOptions) {
      super(pPredicates);
      this.options = pOptions;
   }

   public LootItemFunctionType getType() {
      return LootItemFunctions.SET_INSTRUMENT;
   }

   /**
    * Called to perform the actual action of this function, after conditions have been checked.
    */
   public ItemStack run(ItemStack pStack, LootContext pContext) {
      InstrumentItem.setRandom(pStack, this.options, pContext.getRandom());
      return pStack;
   }

   public static LootItemConditionalFunction.Builder<?> setInstrumentOptions(TagKey<Instrument> pInstrumentOptions) {
      return simpleBuilder((p_231015_) -> {
         return new SetInstrumentFunction(p_231015_, pInstrumentOptions);
      });
   }

   public static class Serializer extends LootItemConditionalFunction.Serializer<SetInstrumentFunction> {
      /**
       * Serialize the value by putting its data into the JsonObject.
       */
      public void serialize(JsonObject p_231029_, SetInstrumentFunction p_231030_, JsonSerializationContext p_231031_) {
         super.serialize(p_231029_, p_231030_, p_231031_);
         p_231029_.addProperty("options", "#" + p_231030_.options.location());
      }

      public SetInstrumentFunction deserialize(JsonObject p_231021_, JsonDeserializationContext p_231022_, LootItemCondition[] p_231023_) {
         String s = GsonHelper.getAsString(p_231021_, "options");
         if (!s.startsWith("#")) {
            throw new JsonSyntaxException("Inline tag value not supported: " + s);
         } else {
            return new SetInstrumentFunction(p_231023_, TagKey.create(Registries.INSTRUMENT, new ResourceLocation(s.substring(1))));
         }
      }
   }
}
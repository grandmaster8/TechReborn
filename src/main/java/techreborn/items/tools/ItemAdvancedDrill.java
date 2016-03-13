package techreborn.items.tools;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import techreborn.config.ConfigTechReborn;

public class ItemAdvancedDrill extends ItemDrill {

    public ItemAdvancedDrill() {
    	super(ToolMaterial.DIAMOND, "techreborn.advancedDrill", ConfigTechReborn.AdvancedDrillCharge, ConfigTechReborn.AdvancedDrillTier, 4.0F);
    	this.cost = 250;
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockIn) {
        return Items.diamond_pickaxe.canHarvestBlock(blockIn) || Items.diamond_shovel.canHarvestBlock(blockIn);
    }

    @Override
    public String getTextureName(int damage) {
        return "techreborn:items/tool/advancedDrill";
    }

    @Override
    public int getMaxMeta() {
        return 1;
    }
}

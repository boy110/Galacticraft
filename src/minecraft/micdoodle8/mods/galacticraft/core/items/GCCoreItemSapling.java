package micdoodle8.mods.galacticraft.core.items;

import micdoodle8.mods.galacticraft.core.blocks.GCCoreBlockSapling;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;

public class GCCoreItemSapling extends ItemBlock
{
    public GCCoreItemSapling(int par1)
    {
        super(par1);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    @Override
	public int getMetadata(int par1)
    {
        return par1;
    }

    @Override
	@SideOnly(Side.CLIENT)

    /**
     * Gets an icon index based on an item's damage value
     */
    public int getIconFromDamage(int par1)
    {
        return Block.sapling.getBlockTextureFromSideAndMetadata(0, par1);
    }

    @Override
	public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = par1ItemStack.getItemDamage();

        if (var2 < 0 || var2 >= BlockSapling.WOOD_TYPES.length)
        {
            var2 = 0;
        }

        return super.getItemName() + "." + BlockSapling.WOOD_TYPES[var2];
    }
}

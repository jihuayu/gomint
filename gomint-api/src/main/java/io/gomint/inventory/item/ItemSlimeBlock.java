package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 3
 */
public interface ItemSlimeBlock extends ItemStack<ItemSlimeBlock> {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
	 * @return freshly generated item
     */
    static ItemSlimeBlock create( int amount ) {
        return GoMint.instance().createItemStack( ItemSlimeBlock.class, amount );
    }

}

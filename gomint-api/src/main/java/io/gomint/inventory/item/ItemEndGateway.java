package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author geNAZt
 * @version 1.0
 */
public interface ItemEndGateway extends ItemStack {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
     */
    static ItemEndGateway create( int amount ) {
        return GoMint.instance().createItemStack( ItemEndGateway.class, amount );
    }

}
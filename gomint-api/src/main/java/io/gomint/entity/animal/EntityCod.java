/*
 * Copyright (c) 2020 Gomint team
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.entity.animal;

import io.gomint.GoMint;
import io.gomint.entity.EntityLiving;

/**
 * @author geNAZt
 * @version 1.0
 * @stability 3
 */
public interface EntityCod extends EntityLiving<EntityCod> {

    /**
     * Create a new cod with no config
     *
     * @return empty, fresh cod
     */
    static EntityCod create() {
        return GoMint.instance().createEntity( EntityCod.class );
    }

}

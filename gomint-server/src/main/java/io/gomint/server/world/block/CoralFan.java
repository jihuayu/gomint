/*
 * Copyright (c) 2018, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.world.block;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.server.world.block.state.RotationDirectionBlockState;
import io.gomint.world.block.BlockCoralFan;
import io.gomint.world.block.BlockType;
import io.gomint.world.block.data.CoralType;
import io.gomint.world.block.data.RotationDirection;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( sId = "minecraft:coral_fan", def = true )
public class CoralFan extends Block implements BlockCoralFan {

    private enum CoralTypeMagic {
        TUBE("blue"),
        BRAIN("pink"),
        BUBBLE("purple"),
        FIRE("red"),
        HORN("yellow"),
        ;

        private final String color;
        CoralTypeMagic(String color) {
            this.color = color;
        }
    }

    private static final RotationDirectionBlockState DIRECTION = new RotationDirectionBlockState(() -> new String[]{"coral_direction"});


    @Override
    public float getBlastResistance() {
        return 0.1f;
    }

    @Override
    public BlockType getBlockType() {
        return BlockType.CORAL_FAN;
    }

    @Override
    public RotationDirection getDirection() {
        return DIRECTION.getState(this);
    }

    @Override
    public void setDirection(RotationDirection direction) {
        DIRECTION.setState(this, direction);
    }

    @Override
    public void setCoralType(CoralType type) {

    }

    @Override
    public CoralType getCoralType() {
        return null;
    }

}

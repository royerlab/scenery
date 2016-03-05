package scenery

import cleargl.GLVector

/**
 * <Description>
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */
class PointLight : Node("PointLight") {
    var intensity: Float = 0.5f
    var emissionColor: GLVector = GLVector(1.0f, 1.0f, 1.0f)
}
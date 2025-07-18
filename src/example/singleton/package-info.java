/**
 * Singletons examples.
 * In this package and subpackages the following labels are used in doc comments,
 * in order to have a simplified "mental tag" for each commonly discussed aspect in singleton idioms.
 * <li>NOT_THREAD_SAFE: Singleton idioms that are not thread-safe, to any extent. They can work only in a
 *      single-threaded program.</li>
 * <li>THREAD_SAFE: Singleton idioms having at least some degree of thread-safety. For the sake of knowledge,
 *      the ones labelled with it contain also idioms that are known to be NOT thread-safe under specific
 *      scenario/attacks.</li>
 * <li>EAGER_INITIALIZATION: Singleton idioms with eager initialization of the instance.</li>
 * <li>LAZY_INITIALIZATION: Singleton idioms with lazy initialization of the instance.</li>
 * <li>SERIALIZATION_FRIENDLY: Singleton idioms with the instance being serializable, using the Serializable interface.
 *      Here by serialization it's meant the one serialization machinery implementing the Java Object Serialization
 *      Specification.</li>
 * <li>PERFORMANCE_HEAVY: Singleton idioms with added condition of having some sort of commonly recognized inefficiency
 *      in performance.</li>
 */
package example.singleton;

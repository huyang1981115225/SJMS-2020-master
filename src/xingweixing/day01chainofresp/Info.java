package xingweixing.day01chainofresp;

/**
 * 责任链模式：
 *          将能够处理同一请求的对象连成一条链，所提交的请求沿着链传递。
 *          链上的对象逐个判断是否有能力处理该请求，如果能则处理，如果不能则传递给下一个对象。
 *
 * 应用场景：
 *        --java中，异常处理机制就是一种责任链模式。一个try可以对应多个catch
 *
 *        --javascript中，事件的冒泡机制
 *
 * @author HuYang
 * @date 2019-11-04 15:07
 */
public class Info {
}

package j$.util.concurrent;

import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Map;

/* loaded from: classes5.dex */
public interface ConcurrentMap extends Map {

    /* compiled from: D8$$SyntheticClass */
    /* renamed from: j$.util.concurrent.ConcurrentMap$-EL, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Object computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Function function) {
            return concurrentMap instanceof ConcurrentMap ? ((ConcurrentMap) concurrentMap).computeIfAbsent(obj, function) : CC.$default$computeIfAbsent(concurrentMap, obj, function);
        }

        public static /* synthetic */ void forEach(java.util.concurrent.ConcurrentMap concurrentMap, BiConsumer biConsumer) {
            if (concurrentMap instanceof ConcurrentMap) {
                ((ConcurrentMap) concurrentMap).forEach(biConsumer);
            } else {
                CC.$default$forEach(concurrentMap, biConsumer);
            }
        }
    }

    @Override // j$.util.Map
    Object computeIfAbsent(Object obj, Function function);

    @Override // j$.util.Map
    void forEach(BiConsumer biConsumer);

    /* renamed from: j$.util.concurrent.ConcurrentMap$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static Object $default$getOrDefault(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2) {
            Object obj3 = concurrentMap.get(obj);
            return obj3 != null ? obj3 : obj2;
        }

        public static void $default$forEach(java.util.concurrent.ConcurrentMap concurrentMap, BiConsumer biConsumer) {
            biConsumer.getClass();
            for (Map.Entry entry : concurrentMap.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (IllegalStateException unused) {
                }
            }
        }

        public static void $default$replaceAll(final java.util.concurrent.ConcurrentMap concurrentMap, final BiFunction biFunction) {
            biFunction.getClass();
            EL.forEach(concurrentMap, new BiConsumer() { // from class: j$.util.concurrent.ConcurrentMap$$ExternalSyntheticLambda0
                @Override // j$.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ConcurrentMap.CC.lambda$replaceAll$0(concurrentMap, biFunction, obj, obj2);
                }

                @Override // j$.util.function.BiConsumer
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer.CC.$default$andThen(this, biConsumer);
                }
            });
        }

        public static /* synthetic */ void lambda$replaceAll$0(java.util.concurrent.ConcurrentMap concurrentMap, BiFunction biFunction, Object obj, Object obj2) {
            while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
            }
        }

        public static Object $default$computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Function function) {
            Object apply;
            function.getClass();
            Object obj2 = concurrentMap.get(obj);
            return (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj2;
        }

        public static Object $default$computeIfPresent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            Object apply;
            biFunction.getClass();
            while (true) {
                Object obj2 = concurrentMap.get(obj);
                if (obj2 == null) {
                    return null;
                }
                apply = biFunction.apply(obj, obj2);
                if (apply == null) {
                    if (concurrentMap.remove(obj, obj2)) {
                        break;
                    }
                } else if (concurrentMap.replace(obj, obj2, apply)) {
                    break;
                }
            }
            return apply;
        }

        public static Object $default$compute(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            Object apply;
            while (true) {
                Object obj2 = concurrentMap.get(obj);
                do {
                    apply = biFunction.apply(obj, obj2);
                    if (apply != null) {
                        if (obj2 != null) {
                            if (concurrentMap.replace(obj, obj2, apply)) {
                                return apply;
                            }
                        } else {
                            obj2 = concurrentMap.putIfAbsent(obj, apply);
                        }
                    } else if (obj2 == null || concurrentMap.remove(obj, obj2)) {
                        return null;
                    }
                } while (obj2 != null);
                return apply;
            }
        }

        public static Object $default$merge(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2, BiFunction biFunction) {
            biFunction.getClass();
            obj2.getClass();
            while (true) {
                Object obj3 = concurrentMap.get(obj);
                while (obj3 == null) {
                    obj3 = concurrentMap.putIfAbsent(obj, obj2);
                    if (obj3 == null) {
                        return obj2;
                    }
                }
                Object apply = biFunction.apply(obj3, obj2);
                if (apply != null) {
                    if (concurrentMap.replace(obj, obj3, apply)) {
                        return apply;
                    }
                } else if (concurrentMap.remove(obj, obj3)) {
                    return null;
                }
            }
        }
    }
}

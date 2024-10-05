package j$.util.stream;

import j$.util.Map;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Collectors {
    static final Set CH_CONCURRENT_ID;
    static final Set CH_CONCURRENT_NOID;
    static final Set CH_ID;
    static final Set CH_NOID;
    static final Set CH_UNORDERED_ID;
    static final Set CH_UNORDERED_NOID;

    /* renamed from: -$$Nest$smcastingIdentity, reason: not valid java name */
    static /* bridge */ /* synthetic */ Function m173$$Nest$smcastingIdentity() {
        return castingIdentity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object lambda$castingIdentity$2(Object obj) {
        return obj;
    }

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        CH_CONCURRENT_ID = Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        CH_CONCURRENT_NOID = Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        CH_ID = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        CH_UNORDERED_ID = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        CH_NOID = Collections.emptySet();
        CH_UNORDERED_NOID = Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    private static IllegalStateException duplicateKeyException(Object obj, Object obj2, Object obj3) {
        return new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", obj, obj2, obj3));
    }

    private static BinaryOperator uniqKeysMapMerger() {
        return new BinaryOperator() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda40
            @Override // j$.util.function.BiFunction
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Collectors.lambda$uniqKeysMapMerger$0((Map) obj, (Map) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Map lambda$uniqKeysMapMerger$0(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            value.getClass();
            Object putIfAbsent = Map.EL.putIfAbsent(map, key, value);
            if (putIfAbsent != null) {
                throw duplicateKeyException(key, putIfAbsent, value);
            }
        }
        return map;
    }

    private static BiConsumer uniqKeysMapAccumulator(final Function function, final Function function2) {
        return new BiConsumer() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda5
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collectors.lambda$uniqKeysMapAccumulator$1(Function.this, function2, (java.util.Map) obj, obj2);
            }

            @Override // j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$uniqKeysMapAccumulator$1(Function function, Function function2, java.util.Map map, Object obj) {
        Object apply = function.apply(obj);
        Object apply2 = function2.apply(obj);
        apply2.getClass();
        Object putIfAbsent = Map.EL.putIfAbsent(map, apply, apply2);
        if (putIfAbsent != null) {
            throw duplicateKeyException(apply, putIfAbsent, apply2);
        }
    }

    private static Function castingIdentity() {
        return new Function() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda58
            @Override // j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return Collectors.lambda$castingIdentity$2(obj);
            }

            @Override // j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class CollectorImpl implements Collector {
        private final BiConsumer accumulator;
        private final Set characteristics;
        private final BinaryOperator combiner;
        private final Function finisher;
        private final Supplier supplier;

        /* JADX INFO: Access modifiers changed from: package-private */
        public CollectorImpl(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
            this.supplier = supplier;
            this.accumulator = biConsumer;
            this.combiner = binaryOperator;
            this.finisher = function;
            this.characteristics = set;
        }

        CollectorImpl(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
            this(supplier, biConsumer, binaryOperator, Collectors.m173$$Nest$smcastingIdentity(), set);
        }

        @Override // j$.util.stream.Collector
        public BiConsumer accumulator() {
            return this.accumulator;
        }

        @Override // j$.util.stream.Collector
        public Supplier supplier() {
            return this.supplier;
        }

        @Override // j$.util.stream.Collector
        public BinaryOperator combiner() {
            return this.combiner;
        }

        @Override // j$.util.stream.Collector
        public Function finisher() {
            return this.finisher;
        }

        @Override // j$.util.stream.Collector
        public Set characteristics() {
            return this.characteristics;
        }
    }

    public static Collector toList() {
        return new CollectorImpl(new Supplier() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda85
            @Override // j$.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }, new BiConsumer() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda23
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }

            @Override // j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda37
            @Override // j$.util.function.BiFunction
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Collectors.lambda$toList$4((List) obj, (List) obj2);
            }
        }, CH_ID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List lambda$toList$4(List list, List list2) {
        list.addAll(list2);
        return list;
    }

    public static Collector toSet() {
        return new CollectorImpl(new Supplier() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda89
            @Override // j$.util.function.Supplier
            public final Object get() {
                return new HashSet();
            }
        }, new BiConsumer() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda24
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Set) obj).add(obj2);
            }

            @Override // j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda41
            @Override // j$.util.function.BiFunction
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Collectors.lambda$toSet$7((Set) obj, (Set) obj2);
            }
        }, CH_UNORDERED_ID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Set lambda$toSet$7(Set set, Set set2) {
        if (set.size() < set2.size()) {
            set2.addAll(set);
            return set2;
        }
        set.addAll(set2);
        return set;
    }

    public static Collector joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static Collector joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        return new CollectorImpl(new Supplier() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda74
            @Override // j$.util.function.Supplier
            public final Object get() {
                return Collectors.lambda$joining$11(charSequence, charSequence2, charSequence3);
            }
        }, new BiConsumer() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda25
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((StringJoiner) obj).add((CharSequence) obj2);
            }

            @Override // j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda43
            @Override // j$.util.function.BiFunction
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((StringJoiner) obj).merge((StringJoiner) obj2);
            }
        }, new Function() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda64
            @Override // j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return ((StringJoiner) obj).toString();
            }

            @Override // j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }, CH_NOID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ StringJoiner lambda$joining$11(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new StringJoiner(charSequence, charSequence2, charSequence3);
    }

    public static Collector toMap(Function function, Function function2) {
        return new CollectorImpl(new Supplier() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda88
            @Override // j$.util.function.Supplier
            public final Object get() {
                return new HashMap();
            }
        }, uniqKeysMapAccumulator(function, function2), uniqKeysMapMerger(), CH_ID);
    }
}

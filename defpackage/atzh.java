package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzh extends aonm implements aooz {
    public static final atzh a;
    private static volatile aopf d;
    public int b;
    public atzf c;
    private atzg e;
    private apmg f;
    private asni g;
    private byte h = 2;

    static {
        atzh atzhVar = new atzh();
        a = atzhVar;
        aonm.registerDefaultInstance(atzh.class, atzhVar);
    }

    private atzh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uea9eᲧ\uf830㷭\u0004\u0000\u0000\u0004\uea9eᲧᐉ\u0002\ueb11ἑᐉ\u0001\ue917►ᐉ\u0000\uf830㷭ᐉ\u0003", new Object[]{"b", "g", "f", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atzh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atzh.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

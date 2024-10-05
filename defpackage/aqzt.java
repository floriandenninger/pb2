package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzt extends aonm implements aooz {
    public static final aqzt a;
    private static volatile aopf b;
    private int c;
    private aqdb d;
    private aqgn e;
    private aqcj f;
    private byte g = 2;

    static {
        aqzt aqztVar = new aqzt();
        a = aqztVar;
        aonm.registerDefaultInstance(aqzt.class, aqztVar);
    }

    private aqzt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf143ᠤ\uf5b1⼞\u0003\u0000\u0000\u0003\uf143ᠤᐉ\u0000\ue567ᠲᐉ\u0002\uf5b1⼞ᐉ\u0001", new Object[]{"c", "d", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqzt.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

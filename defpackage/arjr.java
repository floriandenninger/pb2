package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjr extends aonm implements aooz {
    public static final arjr a;
    private static volatile aopf b;
    private int c;
    private asyv d;
    private avyr e;
    private avys f;
    private apku g;
    private byte h = 2;

    static {
        arjr arjrVar = new arjr();
        a = arjrVar;
        aonm.registerDefaultInstance(arjr.class, arjrVar);
    }

    private arjr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf38eឮ\ue35b僂\u0004\u0000\u0000\u0004\uf38eឮᐉ\u0000\uf66aឮᐉ\u0001\ue887㩾ᐉ\u0003\ue35b僂ᐉ\u0002", new Object[]{"c", "d", "e", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arjr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arjr.class) {
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

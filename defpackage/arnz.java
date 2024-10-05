package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnz extends aonm implements aooz {
    public static final arnz a;
    private static volatile aopf f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        arnz arnzVar = new arnz();
        a = arnzVar;
        aonm.registerDefaultInstance(arnz.class, arnzVar);
    }

    private arnz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0004ဌ\u0006\u0005ဈ\u0007", new Object[]{"b", "c", "d", armv.i, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arnz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arnz.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

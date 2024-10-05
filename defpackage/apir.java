package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apir extends aonm implements aooz {
    public static final apir a;
    private static volatile aopf g;
    public float b;
    public float c;
    public int d;
    public float e;
    public float f;
    private int h;

    static {
        apir apirVar = new apir();
        a = apirVar;
        aonm.registerDefaultInstance(apir.class, apirVar);
    }

    private apir() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apir();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apir.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

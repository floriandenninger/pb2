package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aufv extends aonm implements aooz {
    public static final aufv a;
    private static volatile aopf b;
    private int c;
    private augl d;
    private aufy e;
    private aoxy f;
    private aota g;
    private byte h = 2;

    static {
        aufv aufvVar = new aufv();
        a = aufvVar;
        aonm.registerDefaultInstance(aufv.class, aufvVar);
    }

    private aufv() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0004\u0006ᐉ\u0003", new Object[]{"c", "d", "e", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aufv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aufv.class) {
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

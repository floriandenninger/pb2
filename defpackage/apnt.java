package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apnt extends aonm implements aooz {
    public static final apnt a;
    private static volatile aopf c;
    public atyf b;
    private int d;
    private atyb e;
    private byte f = 2;

    static {
        apnt apntVar = new apnt();
        a = apntVar;
        aonm.registerDefaultInstance(apnt.class, apntVar);
    }

    private apnt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ufdd2ត\uee01ᢝ\u0002\u0000\u0000\u0002\ufdd2តᐉ\u0000\uee01ᢝᐉ\u0001", new Object[]{"d", "e", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new apnt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (apnt.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

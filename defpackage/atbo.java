package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atbo extends aonm implements aooz {
    public static final atbo a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();

    static {
        atbo atboVar = new atbo();
        a = atboVar;
        aonm.registerDefaultInstance(atbo.class, atboVar);
    }

    private atbo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", atbk.e, "d", atbn.class, "e", atbn.class});
            case NEW_MUTABLE_INSTANCE:
                return new atbo();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (atbo.class) {
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

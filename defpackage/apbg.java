package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbg extends aonm implements aooz {
    public static final apbg a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aony d = emptyProtobufList();
    public int e;

    static {
        apbg apbgVar = new apbg();
        a = apbgVar;
        aonm.registerDefaultInstance(apbg.class, apbgVar);
    }

    private apbg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"b", "c", apah.a(), "d", apbf.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apbg();
            case NEW_BUILDER:
                return new aone((char[][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apbg.class) {
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

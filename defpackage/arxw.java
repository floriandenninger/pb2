package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxw extends aonm implements aooz {
    public static final aonv a = new uct(19);
    public static final arxw b;
    private static volatile aopf e;
    public aonu c = emptyIntList();
    public String d = "";
    private int f;

    static {
        arxw arxwVar = new arxw();
        b = arxwVar;
        aonm.registerDefaultInstance(arxw.class, arxwVar);
    }

    private arxw() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"f", "d", "c", atqf.a()});
            case NEW_MUTABLE_INSTANCE:
                return new arxw();
            case NEW_BUILDER:
                return new aone((byte[][][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arxw.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

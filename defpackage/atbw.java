package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atbw extends aonm implements aooz {
    public static final aonv a = new atpn(1);
    public static final atbw b;
    private static volatile aopf e;
    public aonu c = emptyIntList();
    public aony d = emptyProtobufList();

    static {
        atbw atbwVar = new atbw();
        b = atbwVar;
        aonm.registerDefaultInstance(atbw.class, atbwVar);
    }

    private atbw() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"c", atay.a(), "d", atbu.class});
            case NEW_MUTABLE_INSTANCE:
                return new atbw();
            case NEW_BUILDER:
                return new aone((byte[]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (atbw.class) {
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

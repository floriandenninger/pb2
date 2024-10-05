package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzq extends aonm implements aooz {
    public static final aonv a = new atpn(8);
    public static final avzq b;
    private static volatile aopf h;
    public aonu c = emptyIntList();
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;

    static {
        avzq avzqVar = new avzq();
        b = avzqVar;
        aonm.registerDefaultInstance(avzq.class, avzqVar);
    }

    private avzq() {
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
                return newMessageInfo(b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002ဋ\u0000\u0003ဋ\u0001\u0004ဋ\u0002\u0005ဋ\u0003", new Object[]{"i", "c", avzp.a(), "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avzq();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avzq.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

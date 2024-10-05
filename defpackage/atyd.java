package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atyd extends aonm implements aooz {
    public static final atyd a;
    private static volatile aopf l;
    public int b;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public String c = "";
    public aonu d = emptyIntList();
    public boolean k = true;

    static {
        atyd atydVar = new atyd();
        a = atydVar;
        aonm.registerDefaultInstance(atyd.class, atydVar);
    }

    private atyd() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0000\u0002\u0016\u0003င\u0001\u0004င\u0003\u0005ဌ\u0005\u0006ဇ\u0002\u0007ဇ\u0004\bဈ\u0000\tဇ\u0007\u000bဌ\u0006", new Object[]{"b", "d", "e", "g", "i", atyc.a(), "f", "h", "c", "k", "j", apnr.a()});
            case NEW_MUTABLE_INSTANCE:
                return new atyd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (atyd.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

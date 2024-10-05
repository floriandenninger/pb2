package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avdg extends aonm implements aooz {
    public static final avdg a;
    private static volatile aopf k;
    public int b;
    public int c;
    public avde d;
    public avdd e;
    public avdc g;
    public apcr i;
    public avdb j;
    public aomf f = aomf.b;
    public aony h = emptyProtobufList();

    static {
        avdg avdgVar = new avdg();
        a = avdgVar;
        aonm.registerDefaultInstance(avdg.class, avdgVar);
    }

    private avdg() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\tဉ\u0006\n\u001b\fဉ\b\u000eဉ\n", new Object[]{"b", "c", avdh.a(), "d", "e", "f", "g", "h", aqjl.class, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avdg();
            case NEW_BUILDER:
                return new aone((int[][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avdg.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apud extends aonm implements aooz {
    public static final aonv a = new uct(11);
    public static final apud b;
    private static volatile aopf l;
    public int c;
    public int f;
    public aqih j;
    public String d = "";
    public String e = "";
    public aonu g = emptyIntList();
    public String h = "";
    public String i = "";
    public String k = "";

    static {
        apud apudVar = new apud();
        b = apudVar;
        aonm.registerDefaultInstance(apud.class, apudVar);
    }

    private apud() {
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
                return newMessageInfo(b, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0001\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဌ\u0003\u0006\u001e\u0007ဈ\u0004\bဈ\u0005\tဉ\u0006\nဈ\u0007", new Object[]{"c", "d", "e", "f", apqr.l, "g", aovo.a(), "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apud();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (apud.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
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

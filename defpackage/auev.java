package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auev extends aonm implements aooz {
    public static final auev a;
    public static final aonk b;
    private static volatile aopf n;
    public int c;
    public int g;
    public atsn i;
    public awdk j;
    public atxp k;
    public float l;
    public atww m;
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        auev auevVar = new auev();
        a = auevVar;
        aonm.registerDefaultInstance(auev.class, auevVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, auevVar, auevVar, null, 387205844, aoqn.MESSAGE, auev.class);
    }

    private auev() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tခ\b\nဉ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new auev();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (auev.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

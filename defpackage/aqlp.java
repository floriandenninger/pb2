package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqlp extends aonm implements aooz {
    public static final aqlp a;
    private static volatile aopf n;
    public int b;
    public boolean h;
    public aqlm i;
    public aqlo l;
    public aqlo m;
    public String c = "";
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public String f = "";
    public String g = "";
    public String j = "";
    public aony k = emptyProtobufList();

    static {
        aqlp aqlpVar = new aqlp();
        a = aqlpVar;
        aonm.registerDefaultInstance(aqlp.class, aqlpVar);
    }

    private aqlp() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\bဉ\u0005\tဈ\u0006\f\u001b\rဉ\t\u000eဉ\n", new Object[]{"b", "c", "d", aqll.class, "e", aqli.class, "f", "g", "h", "i", "j", "k", aqln.class, "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aqlp();
            case NEW_BUILDER:
                return new aone((byte[]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aqlp.class) {
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

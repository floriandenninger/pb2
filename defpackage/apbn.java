package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbn extends aonm implements aooz {
    public static final aonv a = new uct(7);
    public static final apbn b;
    private static volatile aopf r;
    public int c;
    public aony d = emptyProtobufList();
    public aonu e = emptyIntList();
    public aovy f;
    public boolean g;
    public boolean h;
    public atud i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    private int s;

    static {
        apbn apbnVar = new apbn();
        b = apbnVar;
        aonm.registerDefaultInstance(apbn.class, apbnVar);
    }

    private apbn() {
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
                return newMessageInfo(b, "\u0001\u000e\u0000\u0002\u0002&\u000e\u0000\u0002\u0000\u0002\u001b\u0005\u001e\rဉ\t\u000eဇ\n\u000fဇ\u000b\u0013ဉ\u000f\u0015ခ\u0011\u0016ဇ\u0012\u001bဇ\u0017 ဇ\u001b!ဇ\u001c$ဇ\u001f%ဇ &ဇ!", new Object[]{"c", "s", "d", apec.class, "e", apcm.a(), "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new apbn();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (apbn.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

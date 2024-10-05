package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avdw extends aonm implements aooz {
    public static final avdw a;
    private static volatile aopf s;
    public boolean b;
    public boolean c;
    public float d = 1.0f;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    private int t;

    static {
        avdw avdwVar = new avdw();
        a = avdwVar;
        aonm.registerDefaultInstance(avdw.class, avdwVar);
    }

    private avdw() {
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0016\u0011\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0005\u0003ဇ\u0006\u0004င\u0007\u0005ဇ\u0001\u0006ဇ\u0003\u0007ခ\u0002\bဇ\b\nဇ\t\u000bဇ\u000b\fဇ\u000e\rဇ\u000f\u0010ဇ\n\u0011ဇ\u0011\u0012င\u0012\u0013ဇ\f\u0016ဇ\u0014", new Object[]{"t", "b", "f", "g", "h", "c", "e", "d", "i", "j", "l", "n", "o", "k", "p", "q", "m", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new avdw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (avdw.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

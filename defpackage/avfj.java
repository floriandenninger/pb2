package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avfj extends aonm implements aooz {
    public static final avfj a;
    private static volatile aopf v;
    public int b;
    public int c;
    public float d;
    public int e;
    public boolean f;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public String g = "";
    public aonu p = emptyIntList();
    public String u = "";

    static {
        avfj avfjVar = new avfj();
        a = avfjVar;
        aonm.registerDefaultInstance(avfj.class, avfjVar);
    }

    private avfj() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0002$\u0013\u0000\u0001\u0000\u0002င\u0001\u0007ခ\u0006\tင\b\nဇ\t\rဈ\n\u000eင\u000b\u000fင\f\u0010င\r\u0011င\u000e\u0012င\u000f\u0013င\u0010\u0014ဌ\u0011\u0015ဌ\u0012\u0017\u001e\u0018င\u0013\u0019င\u0014\u001cဇ\u0017#ဌ\u001d$ဈ\u001e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", aukz.e, "o", aqkw.b, "p", avcl.p, "q", "r", "s", "t", atmk.a(), "u"});
            case NEW_MUTABLE_INSTANCE:
                return new avfj();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (avfj.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

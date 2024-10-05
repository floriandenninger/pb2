package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avdj extends aonm implements aooz {
    public static final avdj a;
    private static volatile aopf v;
    public int b;
    public apdy c;
    public apcu d;
    public apeq e;
    public boolean f;
    public apev g;
    public int h;
    public boolean i;
    public int j;
    public boolean k;
    public float l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public long u;
    private int w;

    static {
        avdj avdjVar = new avdj();
        a = avdjVar;
        aonm.registerDefaultInstance(avdj.class, avdjVar);
    }

    private avdj() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0002\u0001#\u0013\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\bဇ\u0007\rဉ\f\u0010င\r\u0013ဇ\u0010\u0015င\u0012\u0017ဇ\u0014\u0018ခ\u0015\u0019ဇ\u0016\u001aဂ\u0017\u001bဇ\u0018\u001cဇ\u0019\u001dဇ\u001a\u001eဂ\u001b!ဌ\u001e\"ဂ\u001f#ဂ ", new Object[]{"b", "w", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", apaf.j, "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new avdj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (avdj.class) {
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

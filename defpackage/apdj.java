package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdj extends aonm implements aooz {
    private static volatile aopf M;
    public static final apdj a;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f93J;
    public aony K;
    public boolean L;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public float n;
    public boolean o;
    public boolean p;
    public aony q = aonm.emptyProtobufList();
    public boolean r;
    public boolean s;
    public apdt t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public aquz y;
    public auyf z;

    static {
        apdj apdjVar = new apdj();
        a = apdjVar;
        aonm.registerDefaultInstance(apdj.class, apdjVar);
    }

    private apdj() {
        emptyIntList();
        emptyIntList();
        this.K = aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001#\u0000\u0002\u0004>#\u0000\u0002\u0000\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဇ\u0005\u0007ဇ\u0007\bဇ\b\tဇ\t\u000bင\u000b\fင\f\rဇ\r\u000eင\u000e\u0013ခ\u0013\u0014ဇ\u0014\u0015ဇ\u0015\u0016\u001a\u0018ဇ\u0016\u0019ဇ\u0017\u001aဉ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b ဇ !ဉ!\"ဉ\"#ဇ#,ဇ*-ဇ+.ဇ,0ဇ.5င27ဇ48ဇ5;ဇ7<ဇ8=\u001a>ဇ9", new Object[]{"b", "c", "d", aqtk.u, "e", apaf.m, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"});
            case NEW_MUTABLE_INSTANCE:
                return new apdj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = M;
                if (aopfVar == null) {
                    synchronized (apdj.class) {
                        aopfVar = M;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            M = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

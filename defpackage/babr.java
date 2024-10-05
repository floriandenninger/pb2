package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babr extends aonm implements aooz {
    private static volatile aopf A;
    public static final babr a;
    public int b;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public bacc l;
    public int m;
    public babp n;
    public int o;
    public babg p;
    public long q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public aonx w;
    public String x;
    public babv y;
    public babn z;
    private byte B = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        babr babrVar = new babr();
        a = babrVar;
        aonm.registerDefaultInstance(babr.class, babrVar);
    }

    private babr() {
        emptyProtobufList();
        this.v = "";
        this.w = emptyLongList();
        this.x = "";
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဌ\b\nဉ\t\u000bဉ\u000b\fᐉ\r\rဂ\u000e\u000eဌ\u000f\u000fဌ\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018ဌ\n\u0019ဈ\u0002\u001aဉ\u0017\u001bဌ\f", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", axcs.u, "l", "n", "p", "q", "r", babu.a(), "s", axcs.t, "u", "v", "t", "x", "w", "y", "m", babq.a(), "e", "z", "o", babt.a()});
            case NEW_MUTABLE_INSTANCE:
                return new babr();
            case NEW_BUILDER:
                return new aone((byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (babr.class) {
                        aopfVar = A;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            A = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdb extends aonh implements aoni {
    private static volatile aopf A;
    public static final aqdb a;
    private int B;
    private aqyg C;
    private aqyg D;
    private apxf E;
    private apkd F;
    private apxf G;
    private aqcz H;
    private arar I;

    /* renamed from: J, reason: collision with root package name */
    private aota f97J;
    private aulq K;
    public int b;
    public avgg d;
    public aqyg e;
    public aqyg f;
    public aqyc g;
    public avgg h;
    public aqyg i;
    public aqyg j;
    public aqyg k;
    public apxf m;
    public apxf n;
    public avrx o;
    public aony p;
    public apkd q;
    public apkd r;
    public apkd s;
    public aqda t;
    public avwi u;
    public atdf v;
    public boolean w;
    public aony x;
    public aomf y;
    public aony z;
    private byte L = 2;
    public String c = "";

    static {
        aqdb aqdbVar = new aqdb();
        a = aqdbVar;
        aonm.registerDefaultInstance(aqdb.class, aqdbVar);
    }

    private aqdb() {
        emptyProtobufList();
        emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.y = aomf.b;
        this.z = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.L);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.L = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001 \u0000\u0002\u00013 \u0000\u0003\u001b\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\b\u0006ᐉ\t\u0007ᐉ\u000b\bᐉ\f\nᐉ\u0004\u000bᐉ$\fᐉ\u000f\rЛ\u000eᐉ\u0006\u0011ᐉ\u0014\u0012ည%\u0017ᐉ\n\u0018ᐉ\u001a\u0019ᐉ\u001b\u001aᐉ\u001f\u001bဇ\u001c\u001cᐉ\u0011\u001dᐉ  Л!ᐉ\u0010\"ᐉ\u0012+ᐉ\u000e,ᐉ\u0013-ဉ\u0015.ᐉ'/ဉ\u00050Л3ᐉ\r", new Object[]{"b", "B", "c", "d", "e", "C", "i", "D", "k", "m", "f", "J", "o", "p", apjt.class, "h", "t", "y", "j", "G", "v", "H", "w", "r", "I", "x", avfv.class, "q", "s", "n", "F", "u", "K", "g", "z", aulq.class, "E"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdb();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (aqdb.class) {
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

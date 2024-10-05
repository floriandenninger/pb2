package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awal extends aonh implements aoni {
    private static volatile aopf B;
    public static final awal a;
    public aulq A;
    private aota C;
    private apkd D;
    private apxf E;
    public int b;
    public aqyg c;
    public aqyg d;
    public avgg e;
    public aqyg f;
    public apsq g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public apxf k;
    public awak m;
    public atdf n;
    public boolean o;
    public apkd s;
    public apkd t;
    public aqyg u;
    public avrx v;
    public awam x;
    public avwi y;
    public aulq z;
    private byte F = 2;
    public aony p = emptyProtobufList();
    public aomf q = aomf.b;
    public String r = "";
    public aony w = emptyProtobufList();

    static {
        awal awalVar = new awal();
        a = awalVar;
        aonm.registerDefaultInstance(awal.class, awalVar);
    }

    private awal() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.F);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.F = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0001\u0001 \u001b\u0000\u0002\u0016\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\t\bᐉ\n\tᐉ\u000b\nဇ\f\fᐉ\u000f\rည\u0011\u000eဈ\u0012\u000fЛ\u0010ᐉ\u0005\u0011ᐉ\u0013\u0012ᐉ\u0014\u0013ᐉ\u0015\u0014ᐉ\u0016\u0015ᐉ\b\u0017ᐉ\u0017\u0019Л\u001aဉ\u0019\u001bဉ\u001a\u001dᐉ\u001b\u001fᐉ\u001d ᐉ\u001e", new Object[]{"b", "c", "d", "e", "f", "h", "i", "k", "m", "n", "o", "C", "q", "r", "p", avfv.class, "g", "D", "s", "t", "u", "j", "v", "w", apjt.class, "x", "y", "z", "E", "A"});
            case NEW_MUTABLE_INSTANCE:
                return new awal();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = B;
                if (aopfVar == null) {
                    synchronized (awal.class) {
                        aopfVar = B;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            B = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

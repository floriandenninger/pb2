package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class owi extends aonm implements aooz {
    private static volatile aopf C;
    public static final owi a;
    public awdk A;
    public int b;
    public int f;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public atsk r;
    public atsl s;
    public boolean u;
    public boolean v;
    public int w;
    public int y;
    public boolean z;
    public aoot x = aoot.a;
    public String c = "";
    public aony d = aonm.emptyProtobufList();
    public String e = "";
    public String g = "";
    public aomf h = aomf.b;
    public String m = "";
    public aomf t = aomf.b;
    public aomf B = aomf.b;

    static {
        owi owiVar = new owi();
        a = owiVar;
        aonm.registerDefaultInstance(owi.class, owiVar);
    }

    private owi() {
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
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0001$\u001a\u0001\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004င\u0002\u0005ဈ\u0003\u0006ည\u0004\u0007ဇ\u0005\bဇ\u0006\u000bဂ\b\fဈ\t\rဇ\n\u000eဇ\u000b\u000fဇ\f\u0012ဇ\u000f\u0013ဉ\u0010\u0015ဉ\u0012\u0016ည\u0013\u001aဇ\u0015\u001bဇ\u0016\u001eဌ\u0019\u001f2 ဌ\u001a!ဇ\u001b\"ဇ\u0007#ဉ\u001c$ည\u001d", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", owg.b(), "x", owh.a, "y", atnn.r, "z", "k", "A", "B"});
            case NEW_MUTABLE_INSTANCE:
                return new owi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = C;
                if (aopfVar == null) {
                    synchronized (owi.class) {
                        aopfVar = C;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            C = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

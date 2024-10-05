package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aseb extends aonm implements aooz {
    public static final aseb a;
    private static volatile aopf t;
    public int b;
    public String c = "";
    public String d = "";
    public aonx e = emptyLongList();
    public aonx f;
    public aonx g;
    public aonx h;
    public aonx i;
    public aonx j;
    public aonx k;
    public aonx l;
    public aonx m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    static {
        aseb asebVar = new aseb();
        a = asebVar;
        aonm.registerDefaultInstance(aseb.class, asebVar);
    }

    private aseb() {
        emptyLongList();
        this.f = emptyLongList();
        this.g = emptyLongList();
        this.h = emptyLongList();
        this.i = emptyLongList();
        this.j = emptyLongList();
        this.k = emptyLongList();
        this.l = emptyLongList();
        this.m = emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002A\u0011\u0000\t\u0000\u0002ဈ\u0001\u0003ဈ\u0000\u0004ဇ\b\u0005\u0015\u0006\u0015\u0007\u0015\b\u0015\t\u0015\n\u0015\fင\t\u000fဇ\u000b\u0012ဇ\r\u0015ဇ\u0013/ဇ\f:\u0015@\u0015A\u0015", new Object[]{"b", "d", "c", "n", "e", "g", "h", "i", "j", "k", "o", "p", "r", "s", "q", "f", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aseb();
            case NEW_BUILDER:
                return new aone((char[]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (aseb.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

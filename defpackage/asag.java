package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asag extends aonm implements aooz {
    public static final asag a;
    private static volatile aopf p;
    public int b;
    public arnb c;
    public int g;
    public arzy h;
    public asad i;
    public asas j;
    public String k;
    public boolean l;
    public String m;
    public aonu n;
    public int o;
    private aryo q;
    private byte r = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        asag asagVar = new asag();
        a = asagVar;
        aonm.registerDefaultInstance(asag.class, asagVar);
    }

    private asag() {
        aomf aomfVar = aomf.b;
        this.k = "";
        this.m = "";
        this.n = emptyIntList();
        aonm.emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001$\u000e\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0004\bဈ\u0003\u000bဉ\u0005\fᐉ\u0007\u0010ဉ\n\u0011ဈ\f\u0014ဉ\u0006\u001aဇ\u0012\u001fဈ\u0017!\u0016$ဌ\u0018", new Object[]{"b", "c", "d", "e", "g", armv.t, "f", "h", "q", "j", "k", "i", "l", "m", "n", "o", argn.i});
            case NEW_MUTABLE_INSTANCE:
                return new asag();
            case NEW_BUILDER:
                return new aone((int[]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (asag.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryo extends aonm implements aooz {
    public static final aryo a;
    private static volatile aopf t;
    public int b;
    public arnb c;
    public boolean e;
    public boolean f;
    public atwv g;
    public boolean h;
    public int j;
    public aonu l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public aryp q;
    public aryt r;
    public aryq s;
    private byte u = 2;
    public String d = "";
    public String i = "";
    public String k = "";

    static {
        aryo aryoVar = new aryo();
        a = aryoVar;
        aonm.registerDefaultInstance(aryo.class, aryoVar);
    }

    private aryo() {
        aomf aomfVar = aomf.b;
        this.l = emptyIntList();
        this.m = "";
        this.n = "";
        this.o = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u001c\u0011\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ᐉ\u0004\u0005ဇ\u0003\bဇ\u0005\tဈ\b\nင\t\fဈ\u000b\u000f\u0016\u0013ဈ\u0010\u0016ဈ\u0013\u0017ဈ\u0014\u0019ဇ\u0015\u001aဉ\u0016\u001bဉ\u0017\u001cဉ\u0018", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new aryo();
            case NEW_BUILDER:
                return new aone((short[]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (aryo.class) {
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

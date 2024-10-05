package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsh extends aonm implements aooz {
    public static final atsh a;
    private static volatile aopf x;
    public int b;
    public long e;
    public atsf g;
    public atsg h;
    public boolean l;
    public boolean m;
    public aqvp n;
    public long o;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    private byte y = 2;
    public aomf c = aomf.b;
    public aomf d = aomf.b;
    public String f = "";
    public aonu i = emptyIntList();
    public aonu j = emptyIntList();
    public aomf k = aomf.b;
    public String p = "";
    public String v = "";
    public String w = "";

    static {
        atsh atshVar = new atsh();
        a = atshVar;
        aonm.registerDefaultInstance(atsh.class, atshVar);
    }

    private atsh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.y);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001!\u0015\u0000\u0002\u0001\u0001ည\u0000\u0002ည\u0001\u0003ဂ\u0002\u0005ဈ\u0004\u0007ဉ\u0007\n\u0016\u000b\u0016\fᐉ\u0006\u0010ည\f\u0011ဇ\r\u0016ဇ\u0012\u0017ဉ\u0013\u0018ဂ\u0014\u0019ဈ\u0015\u001aဇ\u0016\u001bဇ\u0017\u001dဇ\u0019\u001eဇ\u001a\u001fဇ\u001b ဈ\u001c!ဈ\u001d", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
            case NEW_MUTABLE_INSTANCE:
                return new atsh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = x;
                if (aopfVar == null) {
                    synchronized (atsh.class) {
                        aopfVar = x;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            x = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

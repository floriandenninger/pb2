package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atws extends aonm implements aooz {
    public static final atws a;
    private static volatile aopf t;
    public int b;
    public int c;
    public int e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean q;
    public atwt r;
    public aqhv s;
    private byte u = 2;
    public String d = "";
    public String p = "";

    static {
        atws atwsVar = new atws();
        a = atwsVar;
        aonm.registerDefaultInstance(atws.class, atwsVar);
    }

    private atws() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0002\u00034\u0010\u0000\u0000\u0001\u0003ဈ\u0001\u0004ဋ\u0002\u0005ဂ\u0003\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\nဇ\u000b\u000bဇ\f\fဈ\u000e\u001dဇ\u0019\u001fᐉ\u001c%င\u0007&င\b)င\t,ဇ\r4ဉ+", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "m", "n", "p", "q", "r", "j", "k", "l", "o", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new atws();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (atws.class) {
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

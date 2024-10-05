package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atfq extends aonm implements aooz {
    public static final atfq a;
    private static volatile aopf u;
    public int b;
    public long c;
    public boolean d;
    public aquh e;
    public boolean f;
    public auie g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    private int v;
    private int w;

    static {
        atfq atfqVar = new atfq();
        a = atfqVar;
        aonm.registerDefaultInstance(atfq.class, atfqVar);
    }

    private atfq() {
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0003\u0011Q\u0012\u0000\u0000\u0000\u0011ဂ\u000f\u0012ဇ\u0010&ဉ *ဇ#1ဉ*3ဇ+4ဇ,7ဇ/:ဇ4;င5<င6Bဇ9Dဇ;Eင<Hဇ:Iဇ?Jဇ@QဇG", new Object[]{"v", "b", "w", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "q", "o", "r", "s", "t"});
            case NEW_MUTABLE_INSTANCE:
                return new atfq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (atfq.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

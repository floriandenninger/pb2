package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxn extends aonm implements aooz {
    public static final avxn a;
    private static volatile aopf o;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    private int p;
    private int q;

    static {
        avxn avxnVar = new avxn();
        a = avxnVar;
        aonm.registerDefaultInstance(avxn.class, avxnVar);
    }

    private avxn() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0002\u0005.\r\u0000\u0000\u0000\u0005ဇ\u0004\tဇ\b\nဇ\t\u000bဇ\n\u0012ဇ\u0011\u001cဇ\u001b\u001dဌ\u001c\u001fဇ\u001e ဇ\u001f$ဇ#'ဇ&)ဇ(.ဇ-", new Object[]{"p", "q", "b", "c", "d", "e", "f", "g", "h", avts.p, "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new avxn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (avxn.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

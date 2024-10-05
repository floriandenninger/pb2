package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwr extends aonm implements aooz {
    public static final adwr a;
    private static volatile aopf t;
    public int b;
    public aunb e;
    public atyi f;
    public aryv g;
    public aryx h;
    public boolean i;
    public boolean p;
    private byte u = 2;
    public String c = "";
    public String d = "";
    public String j = "";
    public String k = "";
    public aomf l = aomf.b;
    public aomf m = aomf.b;
    public aomf n = aomf.b;
    public aomf o = aomf.b;
    public aony q = emptyProtobufList();
    public aony r = emptyProtobufList();
    public aony s = emptyProtobufList();

    static {
        adwr adwrVar = new adwr();
        a = adwrVar;
        aonm.registerDefaultInstance(adwr.class, adwrVar);
    }

    private adwr() {
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0003\u0003\u0001ဈ\u0000\u0004ဈ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ဇ\b\bဈ\t\tဈ\n\nည\u000b\u000bည\f\fဇ\u000f\r\u001b\u000e\u001b\u000f\u001b\u0011ဉ\u0004\u0012ည\r\u0014ည\u000e\u0015ᐉ\u0007", new Object[]{"b", "c", "d", "f", "g", "i", "j", "k", "l", "m", "p", "q", ajcb.class, "r", ajcb.class, "s", ajcb.class, "e", "n", "o", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new adwr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (adwr.class) {
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

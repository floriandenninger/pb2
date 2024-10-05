package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atwd extends aonm implements aooz {
    public static final atwd a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apxf h;
    private apkd i;
    private apkd j;
    private apkd k;
    private aota l;
    private aqyg m;
    private aqyg n;
    private atdf o;
    private byte p = 2;

    static {
        atwd atwdVar = new atwd();
        a = atwdVar;
        aonm.registerDefaultInstance(atwd.class, atwdVar);
    }

    private atwd() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0003\u0012\f\u0000\u0000\f\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\n\u000bᐉ\f\fᐉ\b\u000eᐉ\u000e\u000fᐉ\u0007\u0010ᐉ\t\u0012ᐉ\u000f", new Object[]{"c", "d", "e", "f", "g", "h", "l", "m", "j", "n", "i", "k", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new atwd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atwd.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

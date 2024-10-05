package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atbm extends aonm implements aooz {
    public static final atbm a;
    private static volatile aopf j;
    public boolean b;
    public boolean c;
    public int d;
    public int g;
    public boolean h;
    private int k;
    private int l;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public String i = "";

    static {
        atbm atbmVar = new atbm();
        a = atbmVar;
        aonm.registerDefaultInstance(atbm.class, atbmVar);
    }

    private atbm() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0002\u00045\b\u0000\u0002\u0000\u0004ဇ\u0003\u0007ဇ\u0005\fင\n\u000f\u001b\u0010\u001b\u0011င\r(ဇ\"5ဈ.", new Object[]{"k", "l", "b", "c", "d", "e", atbr.class, "f", atbs.class, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atbm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (atbm.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

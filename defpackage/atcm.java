package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atcm extends aonm implements aooz {
    public static final atcm a;
    private static volatile aopf l;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private int m;

    static {
        atcm atcmVar = new atcm();
        a = atcmVar;
        aonm.registerDefaultInstance(atcm.class, atcmVar);
    }

    private atcm() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\r\n\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\tင\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f", new Object[]{"m", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atcm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (atcm.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

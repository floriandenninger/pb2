package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atov extends aonm implements aooz {
    public static final atov a;
    private static volatile aopf n;
    public int b;
    public String c = "";
    public aony d = aonm.emptyProtobufList();
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    static {
        atov atovVar = new atov();
        a = atovVar;
        aonm.registerDefaultInstance(atov.class, atovVar);
    }

    private atov() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003င\u0001\u0004င\u0002\u0005င\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\tဌ\u0007\u000bဂ\t\fဌ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", atrx.a(), "l", "m", atnn.u});
            case NEW_MUTABLE_INSTANCE:
                return new atov();
            case NEW_BUILDER:
                return new aone((char[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (atov.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

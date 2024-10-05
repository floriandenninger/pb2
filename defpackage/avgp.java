package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgp extends aonm implements aooz {
    public static final avgp a;
    private static volatile aopf i;
    public int b;
    public apxf f;
    public apxf g;
    private aota j;
    private byte k = 2;
    public aony c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public aomf h = aomf.b;

    static {
        avgp avgpVar = new avgp();
        a = avgpVar;
        aonm.registerDefaultInstance(avgp.class, avgpVar);
    }

    private avgp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0001\u0004\u0002Л\u0003ဈ\u0002\u0004ᐉ\n\u0005ᐉ\u000b\u0006ည\f\nᐉ\t\u000bဈ\u0005", new Object[]{"b", "c", avgo.class, "d", "g", "j", "h", "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avgp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (avgp.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aplt extends aonm implements aooz {
    public static final aplt a;
    private static volatile aopf l;
    public int b;
    public boolean f;
    public aplv g;
    public aplw h;
    public aqil i;
    public int k;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String j = "";

    static {
        aplt apltVar = new aplt();
        a = apltVar;
        aonm.registerDefaultInstance(aplt.class, apltVar);
    }

    private aplt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0000\u0001\u0002ဈ\u0000\u0003ဈ\u0002\u0005ဈ\u0003\u0006ᐉ\u0005\u0007ဇ\u0004\bဉ\u0006\tဉ\u0007\fဈ\n\u000eဌ\u000b", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j", "k", apld.h});
            case NEW_MUTABLE_INSTANCE:
                return new aplt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aplt.class) {
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

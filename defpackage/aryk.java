package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryk extends aonm implements aooz {
    public static final aryk a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aryk arykVar = new aryk();
        a = arykVar;
        aonm.registerDefaultInstance(aryk.class, arykVar);
    }

    private aryk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0001\u0000\ue18fᝊ\ueffb냧\n\u0000\u0000\t\ue18fᝊᐼ\u0000ﮱ᪢ြ\u0000\ue67dḘᐼ\u0000\ue62eḠᐼ\u0000\ue5be⡱ᐼ\u0000\ue63d⨕ᐼ\u0000\ue162⪂ᐼ\u0000\uedf4⺙ᐼ\u0000\uec93怉ᐼ\u0000\ueffb냧ᐼ\u0000", new Object[]{"c", "b", awaw.class, atyu.class, arym.class, avvg.class, aowc.class, aoww.class, aoyx.class, aoxs.class, aoxd.class, aowe.class});
            case NEW_MUTABLE_INSTANCE:
                return new aryk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aryk.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

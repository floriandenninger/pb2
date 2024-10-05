package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspl extends aonm implements aooz {
    public static final aspl a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aspl asplVar = new aspl();
        a = asplVar;
        aonm.registerDefaultInstance(aspl.class, asplVar);
    }

    private aspl() {
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
                return newMessageInfo(a, "\u0001\u000f\u0001\u0000ﴸ㟮\uf266멯\u000f\u0000\u0000\u000eﴸ㟮ᐼ\u0000\ue67e㶿ᐼ\u0000ﲊ㹍ᐼ\u0000ﮓ㼭ᐼ\u0000\uee50㾍ᐼ\u0000\ue359䘒ြ\u0000\ue9ba䘔ᐼ\u0000\uf492䤳ᐼ\u0000\uee51仌ᐼ\u0000\uf616巷ᐼ\u0000\uf602滐ᐼ\u0000\uf863砀ᐼ\u0000簾豣ᐼ\u0000\ueba6딋ᐼ\u0000\uf266멯ᐼ\u0000", new Object[]{"c", "b", asps.class, aspo.class, aspm.class, asqj.class, aspp.class, aspr.class, aspj.class, aqrf.class, aspt.class, asqk.class, aspn.class, aspk.class, asqw.class, auwr.class, auws.class});
            case NEW_MUTABLE_INSTANCE:
                return new aspl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aspl.class) {
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
